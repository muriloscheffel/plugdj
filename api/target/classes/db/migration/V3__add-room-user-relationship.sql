-- Adicionar a coluna room_id na tabela users para representar a relação "muitos para um"
ALTER TABLE users ADD COLUMN room_id BIGINT;

-- Configurar a chave estrangeira para a relação com a tabela rooms
ALTER TABLE users ADD CONSTRAINT fk_users_room FOREIGN KEY (room_id) REFERENCES rooms(id) ON DELETE CASCADE;