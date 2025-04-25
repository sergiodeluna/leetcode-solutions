package easy;

public class SearchInsertPosition {

    public int searchInsertPosition(int[] nums, int target) {
        int left = 0; // Primeira posição do array
        int right = nums.length - 1; // Última posição do array
        int mid = 0;

        while (left <= right) {
            // Calcula o meio do array (forma segura contra 'overflow')
            mid = left + (right - left) / 2;

            // Se o elemento do meio for igual ao alvo, retorna o índice
            if (nums[mid] == target) {
                return mid;
            }

            // Caso especial: apenas um elemento restante no intervalo
            // Se o valor for menor que o alvo, o alvo deve ser inserido na próxima posição (à direita)
            // Caso contrário, o alvo deve ser inserido na posição atual (à esquerda ou sobre o mesmo valor)
            if (left == right) {
                return (nums[mid] < target) ? mid + 1 : mid;
            }

            // Se o elemento do meio for menor que o alvo, significa que o alvo está na metade *direita* do array
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            // Se o elemento do meio for maior que o alvo, significa que o alvo está na metade *esquerda* do array
            else if (nums[mid] > target) {
                right = mid - 1;}
        }

        // Se sair do ‘loop’, o alvo não foi encontrado
        return mid;
    }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int result = searchInsertPosition.searchInsertPosition(nums, target);
        System.out.println("Resultado: " + result); // Esperado: 2
    }
}
