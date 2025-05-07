# 💱 Conversor de Moedas - Java Console

Este é um projeto simples de **conversor de moedas** feito em Java, utilizando requisições HTTP para obter cotações em tempo real via API da [Exchangerate API](https://www.exchangerate-api.com/).

## 🚀 Funcionalidades

- Conversão em tempo real entre diferentes moedas.
- Interface de texto via terminal (console).
- 10 opções de conversão disponíveis.
- Consumo de API externa com tratamento de erros.
- Código simples, limpo e comentado.

## 🔄 Moedas suportadas

1. Dólar (USD) → Real (BRL)  
2. Real (BRL) → Dólar (USD)  
3. Euro (EUR) → Real (BRL)  
4. Real (BRL) → Euro (EUR)  
5. Libra (GBP) → Real (BRL)  
6. Real (BRL) → Libra (GBP)  
7. Peso Argentino (ARS) → Real (BRL)  
8. Real (BRL) → Peso Argentino (ARS)  
9. Dólar (USD) → Euro (EUR)  
10. Euro (EUR) → Dólar (USD)

## 🛠 Tecnologias utilizadas

- Java 17+
- Maven
- [Gson](https://github.com/google/gson) para desserialização JSON
- `java.net.HttpURLConnection` para chamadas HTTP

## 📦 Como executar

### Pré-requisitos:
- Java JDK 17 ou superior
- Maven
- Uma chave de API da [Exchangerate API](https://www.exchangerate-api.com/)

### Passo a passo:

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/conversor-moedas-java.git
   cd conversor-moedas-java
