# Curso de Java - Conversão entre Tipos de Dados

Este repositório contém exemplos práticos e exercícios sobre conversão entre tipos de dados (Type Casting) em Java, demonstrando promoção automática, casting explícito, parsing de strings e tratamento de overflow.

## 📚 Conteúdo

O projeto apresenta diversos conceitos fundamentais sobre manipulação de tipos de dados em Java através de 7 atividades práticas.

### 🔄 Conceitos Abordados

#### 1. **Promoção Automática (Widening)**
Conversão automática de tipos menores para maiores:
```java
int numeroInt = 10;
double numeroDouble = numeroInt; // Conversão automática
```

#### 2. **Casting Explícito (Narrowing)**
Conversão manual de tipos maiores para menores:
```java
double numeroDouble = 123.456;
int numeroInt = (int) numeroDouble; // Perda da parte decimal
```

#### 3. **Parsing de Strings**
Conversão de texto para tipos numéricos:
```java
String numeroTexto = "42";
int numeroInt = Integer.parseInt(numeroTexto);
```

#### 4. **Overflow/Estouro de Variáveis**
Comportamento quando valores excedem os limites dos tipos:
```java
byte valor = 127;
valor++; // Resultado: -128 (overflow)
```

## 🚀 Atividades Práticas

### Atividade 1: Testando a Promoção Automática
- Operações entre `int`, `long` e `double`
- Demonstra como Java promove automaticamente tipos menores

### Atividade 2: Conversão de Tipos
- Casting de `double` para `int`
- Casting de `long` para `byte`
- Observação da perda de dados

### Atividade 3: Cuidado com a Promoção
- Prevenção de overflow em multiplicações
- Uso correto de casting para `long`

### Atividade 4: Parsing de Strings
- Conversão de entrada do usuário
- Tratamento de exceções `NumberFormatException`
- Validação de entrada de dados

### Atividade 5: Calculadora Simples
- Aplicação prática de parsing
- Operações matemáticas básicas
- Uso de `double` para precisão decimal

### Atividade 6: Detectando Estouro de Variável
- Demonstração prática de overflow em `byte`
- Comportamento dos valores limite

### Atividade 7: Trabalhando com Valores Flutuantes
- Diferenças entre `float` e `double`
- Operações com números decimais

## 🔧 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior
- IDE Java (IntelliJ IDEA, Eclipse, VS Code) ou terminal

### Executando o Projeto

1. Clone o repositório:
```bash
git clone <url-do-repositorio>
cd java-type-conversion-course
```

2. Compile o arquivo:
```bash
javac -d out src/main/java/org/example/Main.java
```

3. Execute o programa:
```bash
java -cp out org.example.Main
```

### 💡 Testando Diferentes Atividades

Para executar atividades específicas, descomente as seções correspondentes no arquivo `Main.java`:

- **Atividade 1**: Descomente linhas 16-24
- **Atividade 2**: Descomente linhas 27-35
- **Atividade 3**: Descomente linhas 38-43
- **Atividade 4**: Descomente linhas 46-63
- **Atividade 5**: Descomente linhas 66-76
- **Atividade 6**: Descomente linhas 79-85
- **Atividade 7**: Já está ativa (linhas 88-96)

## 📊 Hierarquia de Tipos (Menor → Maior)

```
byte → short → int → long → float → double
       char  → int
```

### Regras de Conversão:
- ✅ **Automática**: Menor para maior (sem perda de dados)
- ⚠️ **Manual**: Maior para menor (possível perda de dados)

## 🎯 Exemplos de Saída

### Promoção Automática:
```
Resultado da multiplicação de int e double: 305.0
Resultado da soma de int e long: 30
```

### Casting Explícito:
```
Valor original (double): 123.456
Valor convertido (int): 123
```

### Overflow:
```
Valor inicial: 127
Após adicionar 1: -128
Após adicionar mais 1: -127
```

## ⚠️ Pontos Importantes

### Cuidados com Casting:
- **Perda de precisão**: `double` → `int` remove decimais
- **Overflow**: Valores podem "dar a volta" nos limites
- **Underflow**: Valores muito pequenos podem se tornar zero

### Boas Práticas:
- Use `try-catch` ao fazer parsing de strings
- Verifique limites antes de fazer casting
- Prefira tipos maiores quando houver dúvida sobre o tamanho dos dados

## 🔍 Tratamento de Exceções

```java
try {
    int numero = Integer.parseInt(entrada);
    // código seguro
} catch (NumberFormatException e) {
    System.out.println("Entrada inválida!");
}
```

## 📖 Objetivos de Aprendizagem

Ao estudar este código, você aprenderá:

- 🎯 Diferenças entre promoção automática e casting explícito
- 🔄 Como converter entre diferentes tipos primitivos
- 📝 Parsing seguro de strings para números
- ⚠️ Identificar e prevenir overflow/underflow
- 🛡️ Tratamento de exceções em conversões
- 📊 Hierarquia e compatibilidade entre tipos
- 💻 Aplicação prática em calculadoras e sistemas

## 🤝 Contribuição

Este é um projeto educacional. Sugestões de melhorias e novos exemplos são bem-vindas!

## 📚 Material de Apoio

- **Documentação Oracle**: Tipos primitivos em Java
- **Tutorial**: Exception Handling
- **Referência**: Math class para operações avançadas

---

**Autor**: # Curso de Java - Conversão entre Tipos de Dados

Este repositório contém exemplos práticos e exercícios sobre conversão entre tipos de dados (Type Casting) em Java, demonstrando promoção automática, casting explícito, parsing de strings e tratamento de overflow.

## 📚 Conteúdo

O projeto apresenta diversos conceitos fundamentais sobre manipulação de tipos de dados em Java através de 7 atividades práticas.

### 🔄 Conceitos Abordados

#### 1. **Promoção Automática (Widening)**
Conversão automática de tipos menores para maiores:
```java
int numeroInt = 10;
double numeroDouble = numeroInt; // Conversão automática
```

#### 2. **Casting Explícito (Narrowing)**
Conversão manual de tipos maiores para menores:
```java
double numeroDouble = 123.456;
int numeroInt = (int) numeroDouble; // Perda da parte decimal
```

#### 3. **Parsing de Strings**
Conversão de texto para tipos numéricos:
```java
String numeroTexto = "42";
int numeroInt = Integer.parseInt(numeroTexto);
```

#### 4. **Overflow/Estouro de Variáveis**
Comportamento quando valores excedem os limites dos tipos:
```java
byte valor = 127;
valor++; // Resultado: -128 (overflow)
```

## 🚀 Atividades Práticas

### Atividade 1: Testando a Promoção Automática
- Operações entre `int`, `long` e `double`
- Demonstra como Java promove automaticamente tipos menores

### Atividade 2: Conversão de Tipos
- Casting de `double` para `int`
- Casting de `long` para `byte`
- Observação da perda de dados

### Atividade 3: Cuidado com a Promoção
- Prevenção de overflow em multiplicações
- Uso correto de casting para `long`

### Atividade 4: Parsing de Strings
- Conversão de entrada do usuário
- Tratamento de exceções `NumberFormatException`
- Validação de entrada de dados

### Atividade 5: Calculadora Simples
- Aplicação prática de parsing
- Operações matemáticas básicas
- Uso de `double` para precisão decimal

### Atividade 6: Detectando Estouro de Variável
- Demonstração prática de overflow em `byte`
- Comportamento dos valores limite

### Atividade 7: Trabalhando com Valores Flutuantes
- Diferenças entre `float` e `double`
- Operações com números decimais

## 🔧 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior
- IDE Java (IntelliJ IDEA, Eclipse, VS Code) ou terminal

### Executando o Projeto

1. Clone o repositório:
```bash
git clone <url-do-repositorio>
cd java-type-conversion-course
```

2. Compile o arquivo:
```bash
javac -d out src/main/java/org/example/Main.java
```

3. Execute o programa:
```bash
java -cp out org.example.Main
```

### 💡 Testando Diferentes Atividades

Para executar atividades específicas, descomente as seções correspondentes no arquivo `Main.java`:

- **Atividade 1**: Descomente linhas 16-24
- **Atividade 2**: Descomente linhas 27-35
- **Atividade 3**: Descomente linhas 38-43
- **Atividade 4**: Descomente linhas 46-63
- **Atividade 5**: Descomente linhas 66-76
- **Atividade 6**: Descomente linhas 79-85
- **Atividade 7**: Já está ativa (linhas 88-96)

## 📊 Hierarquia de Tipos (Menor → Maior)

```
byte → short → int → long → float → double
       char  → int
```

### Regras de Conversão:
- ✅ **Automática**: Menor para maior (sem perda de dados)
- ⚠️ **Manual**: Maior para menor (possível perda de dados)

## 🎯 Exemplos de Saída

### Promoção Automática:
```
Resultado da multiplicação de int e double: 305.0
Resultado da soma de int e long: 30
```

### Casting Explícito:
```
Valor original (double): 123.456
Valor convertido (int): 123
```

### Overflow:
```
Valor inicial: 127
Após adicionar 1: -128
Após adicionar mais 1: -127
```

## ⚠️ Pontos Importantes

### Cuidados com Casting:
- **Perda de precisão**: `double` → `int` remove decimais
- **Overflow**: Valores podem "dar a volta" nos limites
- **Underflow**: Valores muito pequenos podem se tornar zero

### Boas Práticas:
- Use `try-catch` ao fazer parsing de strings
- Verifique limites antes de fazer casting
- Prefira tipos maiores quando houver dúvida sobre o tamanho dos dados

## 🔍 Tratamento de Exceções

```java
try {
    int numero = Integer.parseInt(entrada);
    // código seguro
} catch (NumberFormatException e) {
    System.out.println("Entrada inválida!");
}
```

## 📖 Objetivos de Aprendizagem

Ao estudar este código, você aprenderá:

- 🎯 Diferenças entre promoção automática e casting explícito
- 🔄 Como converter entre diferentes tipos primitivos
- 📝 Parsing seguro de strings para números
- ⚠️ Identificar e prevenir overflow/underflow
- 🛡️ Tratamento de exceções em conversões
- 📊 Hierarquia e compatibilidade entre tipos
- 💻 Aplicação prática em calculadoras e sistemas

## 🤝 Contribuição

Este é um projeto educacional. Sugestões de melhorias e novos exemplos são bem-vindas!

## 📚 Material de Apoio

- **Documentação Oracle**: Tipos primitivos em Java
- **Tutorial**: Exception Handling
- **Referência**: Math class para operações avançadas

---

**Autor**: Vinícius Santos Briches  
**Curso**: Fundamentos Java 
**Versão**: 1.0  
**Data**: 2025  
**Curso**: Programação em Java - Conversão de Tipos de Dados  
**Versão**: 1.0  
**Data**: 2025
