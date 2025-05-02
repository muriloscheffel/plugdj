# Plug.dj Clone

Este é um projeto pessoal inspirado no **Plug.dj**, uma plataforma de música social onde os usuários podem criar salas, compartilhar músicas e interagir com outros usuários. O objetivo deste projeto é praticar e demonstrar habilidades em desenvolvimento web utilizando **Spring Boot** no backend e **React** no frontend.

---

## Principais Tecnologias

<img 
    align="left"
    alt="Java" 
    title="Java"
    width="30px" 
    style="padding-right: 10px;"
    src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg"
/>
<img 
    align="left"
    alt="Spring" 
    title="Spring"
    width="30px" 
    style="padding-right: 10px;"
    src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/spring/spring-original.svg" 
/>
<img 
    align="left"
    alt="TypeScript" 
    title="TypeScript"
    width="30px" 
    style="padding-right: 10px;"
    src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/typescript/typescript-original.svg" 
/>
<img 
    align="left"
    alt="React" 
    title="React"
    width="30px" 
    style="padding-right: 10px;"
    src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/react/react-original.svg" 
/>
<img 
    align="left"
    alt="Vite" 
    title="Vite"
    width="30px" 
    style="padding-right: 10px;"
    src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/vitejs/vitejs-original.svg" 
/>
<img
    align="left"
    alt="PostgreSQL" 
    title="PostgreSQL"
    width="30px" 
    style="padding-right: 10px;" 
    src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/postgresql/postgresql-original.svg" 
/>
<img 
    align="left"
    alt="Docker" 
    title="Docker"
    width="30px" 
    style="padding-right: 10px;" 
    src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/docker/docker-original.svg" 
/>
aaa


## Funcionalidades

- **Autenticação de Usuários**:

  - Registro e login com autenticação baseada em **JWT**.
  - Proteção de rotas para usuários autenticados.

- **Gerenciamento de Salas**(a implementar):

  - Criação de salas com capacidade limitada.
  - Lista de usuários conectados em cada sala.

- **Fila de DJs**(a implementar):

  - Gerenciamento de uma fila de DJs para tocar músicas em uma sala.

- **Playlists e Músicas**(a implementar):

  - Criação e gerenciamento de playlists.
  - Adição de músicas às playlists.

- **Chat em Tempo Real**(a implementar):
  - Envio de mensagens dentro das salas.

---

## Tecnologias Utilizadas

### Backend

- **Java** com **Spring Boot**
- **Spring Security** para autenticação e autorização
- **JWT** para autenticação baseada em tokens
- **JPA/Hibernate** para persistência de dados
- **PostgreSQL** como banco de dados relacional

### Frontend

- **React** com **Vite**
- **Tailwind CSS** para estilização
- **Axios** para consumo da API

---

## Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas no seu ambiente:

- **Java 17+**
- **Node.js 18+**
- **Docker** e **Docker Compose** (para rodar o banco de dados)
- **Maven** (para gerenciar dependências do backend)

---

## Estrutura do Projeto

### Backend (`/api`)

- **`controllers`**: Controladores REST para gerenciar endpoints.
- **`services`**: Lógica de negócios.
- **`models`**: Entidades JPA.
- **`repositories`**: Interfaces para acesso ao banco de dados.
- **`infra/security`**: Configurações de segurança e autenticação.

### Frontend (`/frontend`)

- **`components`**: Componentes reutilizáveis do React.
- **`pages`**: Páginas principais da aplicação.
- **`AppRoutes.tsx`**: Configuração de rotas.
- **`index.css`**: Estilização global com Tailwind CSS.

---

## Endpoints da API

### Autenticação

- **POST** `/api/auth/login`: Login do usuário.
- **POST** `/api/auth/register`: Registro de um novo usuário.

### Usuários

- **GET** `/api/users`: Lista todos os usuários.

### Salas

- **GET** `/api/rooms`: Lista todas as salas.
- **POST** `/api/rooms`: Cria uma nova sala.
