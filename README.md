
# 💱 Conversor de Moedas em Java (POO + API)

Este é um projeto Java que realiza conversão de moedas utilizando a [ExchangeRate-API](https://www.exchangerate-api.com/). A aplicação é baseada em **programação orientada a objetos (POO)** e executada via terminal com um menu interativo.

---

## 📌 Funcionalidades

- Conversão entre:
  - Dólar ⇄ Peso Argentino
  - Dólar ⇄ Real Brasileiro
  - Dólar ⇄ Peso Colombiano
- Consumo de API via `HttpURLConnection`
- Organização com classes separadas
- Formatação monetária com 2 casas decimais

---

## 🛠️ Tecnologias

- Java 17 ou superior
- Biblioteca externa: [`org.json`](https://mvnrepository.com/artifact/org.json/json) para parsing do JSON

---

## 📁 Estrutura do Projeto

```
ConversorDeMoeda/
│
├── src/
│   ├── ConversorApp.java      # Classe principal com menu
│   ├── Conversao.java         # Classe modelo (POJO)
│   └── MoedaService.java      # Classe de acesso à API
│
├── lib/
│   └── json-20231013.jar      # Biblioteca org.json
│
├── README.md
```

---

## ▶️ Como Executar

### 1. Clone o repositório

```bash
git clone https://github.com/seu-usuario/ConversorDeMoeda.git
cd ConversorDeMoeda
```

### 2. Importar no Eclipse

- No Eclipse:  
  `File > Import > Existing Projects into Workspace`
- Selecione a pasta do projeto
- Verifique se o `.jar` aparece em **Referenced Libraries**

### 3. Execute

Rode a classe `ConversorApp.java`. Você verá o seguinte menu:

```
1) Dollar --> Peso Argentino
2) Peso Argentino --> Dollar 
3) Dollar --> Real Brasileiro
4) Real Brasileiro --> Dollar 
5) Dollar --> Peso Colombiano
6) Peso Colombiano --> Dollar 
7) Sair
```

---

## 🔐 Como obter uma chave da API

1. Acesse: [https://www.exchangerate-api.com/](https://www.exchangerate-api.com/)
2. Cadastre-se gratuitamente
3. Substitua a chave no código:

```java
private final String API_KEY = "SUA_CHAVE_AQUI";
```

---

## 👤 Autor

- [Daniel Jara](https://github.com/seu-usuario)

---

## 📝 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
