📚 Design Patterns - Exemplos em Java<br>
Este repositório foi criado com o objetivo de demonstrar, de forma prática, a utilização de Design Patterns (Padrões de Projeto) em Java.<br>
Abaixo estão os padrões já implementados, juntamente com suas descrições:<br><br>

🏗️ Padrões Criacionais<br>
1. Singleton<br>
O padrão Singleton tem como objetivo garantir que uma classe possua apenas uma única instância ao longo de toda a aplicação, além de fornecer um ponto global de acesso a essa instância.<br>
Esse padrão é especialmente útil para evitar problemas como:<br><br>

❌ Criação desnecessária de múltiplas instâncias (desperdício de recursos)<br>
⚠️ Problemas de concorrência<br>
🔄 Inconsistência de estado entre objetos<br><br>

✅ Com o uso do Singleton, esses problemas são mitigados ao centralizar o controle da instância.<br>
📌 Exemplo implementado:<br>
A implementação pode ser encontrada na classe SingletonCache.java.
