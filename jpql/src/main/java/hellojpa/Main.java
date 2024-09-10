package hellojpa;

import hellojpa.jpql.Member;
import hellojpa.jpql.MemberDTO;
import hellojpa.jpql.MemberType;
import hellojpa.jpql.Team;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            Team teamA = new Team();
            teamA.setName("teamA");
            em.persist(teamA);

            Team teamB = new Team();
            teamB.setName("teamB");
            em.persist(teamB);

            Member member1= new Member();
            member1.setName("member1");
            member1.setAge(20);
            member1.setTeam(teamA);
            em.persist(member1);

            Member member2= new Member();
            member2.setName("member2");
            member2.setAge(40);
            member2.setTeam(teamA);
            em.persist(member2);

            Member member3= new Member();
            member3.setName("member3");
            member3.setAge(30);
            member3.setTeam(teamB);
            em.persist(member3);

            em.flush();
            em.clear();


            String query = "SELECT m FROM Member m";

            List<Member> result = em.createQuery(query, Member.class)
                    .getResultList();

            for (Member member : result) {
                System.out.println("member: " + member.getName() + ", " + member.getTeam().getName() + ", " + member.getId());
            }

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }

        emf.close();
    }
}