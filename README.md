# Agenda e Diário API
Esta é uma API RESTful desenvolvida em Spring Boot para gerenciar uma agenda e um diário pessoal. Os usuários podem fazer login com seu email e senha, criar, visualizar, editar e excluir eventos na agenda, bem como entradas no diário.

# Endpoints

## Autenticação
POST /api/auth/login: Realiza o login do usuário com email e senha. <br>
POST /api/auth/logout: Realiza o logout do usuário.

## Agenda
GET /api/agenda: Retorna todos os eventos da agenda. <br>
GET /api/agenda/{id}: Retorna detalhes de um evento específico.<br>
POST /api/agenda/create: Cria um novo evento na agenda.<br>
PUT /api/agenda/{id}/update: Atualiza um evento existente na agenda.<br>
DELETE /api/agenda/{id}/delete: Exclui um evento existente da agenda.<br>

## Diário
GET /api/diario: Retorna todas as entradas do diário.<br>
GET /api/diario/{id}: Retorna detalhes de uma entrada específica do diário.<br>
POST /api/diario/create: Cria uma nova entrada no diário.<br>
PUT /api/diario/{id}/update: Atualiza uma entrada existente no diário.<br>
DELETE /api/diario/{id}/delete: Exclui uma entrada existente do diário.<br>

## Usuário
GET /api/user/profile: Retorna o perfil do usuário logado.<br>
PUT /api/user/profile/update: Atualiza o perfil do usuário (email e senha).<br>
