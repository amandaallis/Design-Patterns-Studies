📚 Design Patterns - Exemplos em Java
Este repositório foi criado com o objetivo de demonstrar, de forma prática, a utilização de Design Patterns (Padrões de Projeto) em Java.
Abaixo estão os padrões já implementados, juntamente com suas descrições:

🏗️ Padrões Criacionais
1. Singleton
O padrão Singleton tem como objetivo garantir que uma classe possua apenas uma única instância ao longo de toda a aplicação, além de fornecer um ponto global de acesso a essa instância.
Esse padrão é especialmente útil para evitar problemas como:

❌ Criação desnecessária de múltiplas instâncias (desperdício de recursos)
⚠️ Problemas de concorrência
🔄 Inconsistência de estado entre objetos

✅ Com o uso do Singleton, esses problemas são mitigados ao centralizar o controle da instância.
📌 Exemplo implementado:
A implementação pode ser encontrada na classe SingletonCache.java.
