package com.scheffel.api.models;
// package com.scheffel.api.models;

// import java.time.LocalDateTime;

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

// @Entity(name = "messages")
// @Table(name = "messages")
// @Data
// @AllArgsConstructor
// @NoArgsConstructor
// public class Message {

//   @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
//   private Long id;

//   private String content; // Conteúdo da mensagem

//   @ManyToOne
//   @JoinColumn(name = "user_id")
//   private User user; // Usuário que enviou a mensagem

//   @ManyToOne
//   @JoinColumn(name = "room_id")
//   private Room room; // Sala onde a mensagem foi enviada

//   private LocalDateTime sentAt; // Data e hora do envio
// }