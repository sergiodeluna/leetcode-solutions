package easy;

class VersionControl {
    // Suponha que a primeira versão com falha seja a versão 4
    int bad = 4;

    // Simula a API
    boolean isBadVersion(int version) {
        return version >= bad;
    }
}

public class FirstBadVersion extends VersionControl {

    public int findFirstBadVersion(int n) {
        int left = 1; // Início do intervalo de versões (começa do 1)
        int right = n; // Fim do intervalo de versões (até n)
        int firstBadVersion = 1; // Variável para armazenar a primeira versão com falha encontrada

        while (left <= right) {
            // Calcula o meio do intervalo (forma segura contra 'overflow')
            int mid = left + (right - left) / 2;

            // Se a versão do meio estiver com falha, então a primeira versão com falha possivelmente estará à esquerda (inclusive o mid)
            if (isBadVersion(mid)) {
                firstBadVersion = mid; // Atualiza a possível primeira versão com falha
                right = mid - 1; // Segue a busca à esquerda
            }
            // Se a versão do meio for boa, a primeira versão com falha está à direita
            else {
                left = mid + 1;
            }
        }

        // Retorna a primeira versão com falha encontrada
        return firstBadVersion;
    }

    public static void main(String[] args) {
        FirstBadVersion firstBadVersion = new FirstBadVersion();
        int n = 5;
        int result = firstBadVersion.findFirstBadVersion(n);
        System.out.println("Primeira versão ruim: " + result); // Esperado: 4
    }
}
