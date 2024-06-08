    package kodlamaio.hrms.entities.cvEntities;
    import jakarta.persistence.*;
    import kodlamaio.hrms.entities.userEntities.Candidate;
    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name = "projects")
    public class ProjectInfo {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "project_name", nullable = false)
        private String projectName;

        @Column(name = "description")
        private String description;

        @Column(name = "start_year", nullable = false)
        private int startYear;

        @Column(name = "end_year")
        private Integer endYear;

        @ManyToOne
        @JoinColumn(name = "candidate_id", nullable = false)
        private Candidate candidate; // Proje bilgisi hangi adaya ait olduğunu belirlemek için.
    }
