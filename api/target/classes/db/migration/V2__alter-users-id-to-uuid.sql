-- Alterando o tipo da coluna 'id' para UUID

-- Adicionar uma nova coluna temporária com o tipo desejado
ALTER TABLE users ADD COLUMN new_id UUID DEFAULT gen_random_uuid();

-- Copiar os valores existentes para a nova coluna (se necessário)
-- (No caso de SERIAL, você pode gerar novos UUIDs, então este passo pode ser opcional)

-- Remover a coluna antiga
ALTER TABLE users DROP COLUMN id;

-- Renomear a nova coluna para substituir a antiga
ALTER TABLE users RENAME COLUMN new_id TO id;

-- Tornar a nova coluna a chave primária
ALTER TABLE users ADD PRIMARY KEY (id);