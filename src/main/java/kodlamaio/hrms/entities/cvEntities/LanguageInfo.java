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
    @Table(name = "languages")
    public class LanguageInfo {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "language", nullable = false)
        private String language;

        @Column(name = "level", nullable = false)
        private int level;

        @ManyToOne
        @JoinColumn(name = "candidate_id", nullable = false)
        private Candidate candidate;
    }
