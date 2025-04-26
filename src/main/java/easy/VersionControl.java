package easy;

// Classe que simula uma API para o problema do 'FirstBadVersion'
public class VersionControl {
    // Suponha que a primeira versão com falha seja a versão 4
    protected int bad = 4;

    // Simula a API
    protected boolean isBadVersion(int version) {
        return version >= bad;
    }
}
