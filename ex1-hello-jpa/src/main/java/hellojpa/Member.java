package hellojpa;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@SequenceGenerator(name="member_seq_generator", sequenceName = "member_seq")
public class Member {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long Id;

    @Column(name = "USERNAME")
    private String username;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    public Long getId() { return Id; }

    public void setId(Long id) { Id = id; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public void setTeam(Team team) { this.team = team; }

    public Team getTeam() { return team; }
}
