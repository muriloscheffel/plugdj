package com.scheffel.api.models;
// package com.scheffel.api.models;

// import java.time.LocalDateTime;
// import java.util.List;

// import jakarta.persistence.CascadeType;
// import jakarta.persistence.Entity;
// import jakarta.persistence.FetchType;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.OneToMany;
// import jakarta.persistence.PrePersist;
// import jakarta.persistence.Table;

// @Entity
// @Table(name = "playlists")
// public class Playlist {

//   @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
//   private Long id;

//   private String name;
//   private String description;
//   private String coverImageUrl;
//   private LocalDateTime createdAt;

//   @ManyToOne
//   @JoinColumn(name = "user_id")
//   private User owner;

//   @OneToMany(mappedBy = "playlist", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//   @JoinColumn(name = "playlist_id")
//   private List<Song> songs;
  
//   @PrePersist
//   protected void onCreate() {
//     createdAt = LocalDateTime.now();
//   }
// }
