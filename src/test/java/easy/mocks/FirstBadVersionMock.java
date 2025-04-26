package easy.mocks;

import easy.FirstBadVersion;

public class FirstBadVersionMock extends FirstBadVersion {
    private final int bad;

    public FirstBadVersionMock(int bad) {
        this.bad = bad;
    }

    @Override
    protected boolean isBadVersion(int version) {
        return version >= bad;
    }
}
