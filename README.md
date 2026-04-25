
# 🎬 Sistema de Cinema (Java)

Projeto desenvolvido em Java com foco em **Programação Orientada a Objetos (POO)**, simulando o funcionamento básico de um cinema via terminal.

---

## 🚀 Funcionalidades

- 📽️ Listagem de sessões disponíveis
- 🪑 Visualização da sala com assentos
- ✅ Reserva de assentos (ex: A1, B5, C10)
- ❌ Cancelamento de reservas
- 🔁 Navegação entre menus
- 🧠 Validação de entradas do usuário

---

## 🧱 Estrutura do Projeto

```
src/
├── Instituicao/
│ ├── Filme.java
│ ├── Sala.java
│ └── Sessao.java
│
├── Controller/
│ └── MenuControler.java
│
└── Main.java
```

---

## 🧠 Conceitos aplicados

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Separação de responsabilidades (Model / Controller)
- Manipulação de arrays bidimensionais (`char[][]`)
- Tratamento de exceções
- Entrada de dados com `Scanner`

---

## 🎮 Como usar

### 1. Iniciar o sistema

Ao rodar o projeto, será exibido:


[1] - Iniciar serviço
[2] - Encerrar


---

### 2. Escolher uma sessão

Exemplo:


[1] - Backrooms (Sala 01 - 15:35)
[2] - Homem Aranha...


---

### 3. Interagir com a sala


[1] - Reservar Assentos
[2] - Cancelar Reservas
[3] - Voltar


---

### 4. Reservar assentos

Digite múltiplos assentos:


A1 B5 C10


---

### 5. Cancelar assentos

Mesmo formato:


A1 B5


---

## 🪑 Representação dos assentos


O → Livre
X → Ocupado


---

## ⚠️ Observações

- Cada sessão possui sua própria sala (estado independente de assentos)
- Entrada inválida é tratada para evitar erros
- O sistema roda totalmente em terminal (CLI)

---

## 🔧 Possíveis melhorias futuras

- 💾 Persistência de dados (arquivo ou banco)
- 👤 Sistema de usuário
- 💳 Pagamento de ingressos
- 🎨 Interface gráfica (JavaFX ou Swing)
- 📊 Contador de assentos disponíveis

---

## 👨‍💻 Autor

Pedro G.

---

## 📌 Status do Projeto

🟢 Em desenvolvimento / aprendizado

---
