# leetcode-solutions
Este repositório contém minhas soluções para desafios do LeetCode, organizadas por nível de dificuldade (Easy, Medium, Hard). O objetivo é praticar algoritmos e estruturas de dados, acompanhar minha evolução e compartilhar conhecimento com outros desenvolvedores.

---

## Easy

### Binary Search

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
int result = search(nums, target); // Esperado 4
```

### Search Insert Position

**Problema:**  
Dado um array ordenado de inteiros distintos e um valor alvo, retorne o índice se o alvo for encontrado. Caso contrário, retorne o índice onde ele deveria ser inserido para manter a ordem.

**Solução:**  
Implementei a busca binária tradicional, onde:  
- Utilizo dois ponteiros (`left` e `right`) que delimitam a parte do array em que o alvo pode estar.  
- A cada iteração, comparo o valor central com o alvo.  
  - Se forem iguais, retorno o índice.  
  - Se o valor for menor, avanço o ponteiro da esquerda (`left = mid + 1`).  
  - Se o valor for maior, movo o ponteiro da direita (`right = mid - 1`).  
- Caso reste apenas um elemento (`left == right`), verifico se o alvo deve ser inserido antes ou depois desse valor.  
- Complexidade: **O(log n)**

**Código:** [`SearchInsertPosition.java`](src/main/java/easy/SearchInsertPosition.java)

**Exemplo de uso:**

```java
int[] nums = {1, 3, 5, 6};
int target = 5;
int result = searchInsertPosition(nums, target); // Esperado 2
```

### First Bad Version

**Problema:**
Considere `n` versões numeradas de `1` a `n` de um projeto e uma API `isBadVersion(version)` que informa se uma versão contém falha. Supondo que uma vez que uma versão possui uma falha, todas as versões posteriores também conterá a falha, implemente um algoritmo para encontrar a **primeira** versão com falha. Minimize o número de chamadas à API.

**Solução:**  
Implementei a busca binária tradicional, onde:
- Utilizo dois ponteiros (`left` e `right`) para delimitar o intervalo de busca.
- A cada iteração, verifico se a versão do meio (`mid`) possui falha usando `isBadVersion(mid)`.
  - Se possuir falha, atualizo o `firstBadVersion` com `mid` e continuo a busca à esquerda (`right = mid - 1`).
  - Se não possuir falha, ou seja se estiver estável, continuo a busca à direita (`left = mid + 1`).
- Complexidade: **O(log n)**

**Código:** [`FirstBadVersion.java`](src/main/java/easy/FirstBadVersion.java)

**Exemplo de uso:**

```java
int n = 5;
int result = findFirstBadVersion(n); // Esperado 4
```
---