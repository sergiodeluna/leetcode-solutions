# leetcode-solutions
Este repositório contém minhas soluções para desafios do LeetCode, organizadas por nível de dificuldade (Easy, Medium, Hard). O objetivo é praticar algoritmos e estruturas de dados, acompanhar minha evolução e compartilhar conhecimento com outros desenvolvedores.

---

## ✅ Easy

### 🔍 Binary Search

**Problema:**  
Dado um array ordenado de inteiros e um número alvo, implemente uma busca binária para retornar o índice do alvo. Se o alvo não existir no array, retorne `-1`.

**Solução:**  
Implementei a busca binária tradicional, onde:
- Utilizo dois ponteiros (`left` e `right`) que delimitam a parte do array em que o alvo pode estar.
- A cada iteração, comparo o valor central com o alvo.
    - Se forem iguais, retorno o índice.
    - Se o valor for menor, avanço o ponteiro da esquerda (`left = mid + 1`).
    - Se o valor for maior, movo o ponteiro da direita (`right = mid - 1`).
- Complexidade: **O(log n)**

**Código:** [`BinarySearch.java`](src/main/java/easy/BinarySearch.java)

**Exemplo de uso:**

```java
int[] nums = {-1, 0, 3, 5, 9, 12};
int target = 9;
int result = search(nums, target); // Retorna 4