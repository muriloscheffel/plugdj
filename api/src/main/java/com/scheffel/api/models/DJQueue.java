package com.scheffel.api.models;
// package com.scheffel.api.models;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.Table;
// import lombok.AllArgsConstructor;
// import lombok.Data;
// import lombok.NoArgsConstructor;

// @Entity(name = "dj_queue")
// @Table(name = "dj_queue")
// @Data
// @AllArgsConstructor
// @NoArgsConstructor
// public class DJQueue {

//   @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
//   private Long id;

//   @ManyToOne
//   @JoinColumn(name = "user_id")
//   private User user; // Usuário na fila

//   @ManyToOne
//   @JoinColumn(name = "room_id")
//   private Room room; // Sala onde o usuário está na fila

//   private int position; // Posição na fila
// }