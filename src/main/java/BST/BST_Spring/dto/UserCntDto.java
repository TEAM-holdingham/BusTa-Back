package BST.BST_Spring.dto;


public class UserCntDto {
    private Long totalUserCnt;
    private Long totalAdminCnt;
    private Long totalBronzeCnt;
    private Long totalSilverCnt;
    private Long totalGoldCnt;
    private Long totalBlacklistCnt;

    public UserCntDto(Long totalUserCnt, Long totalAdminCnt, Long totalBronzeCnt, Long totalSilverCnt, Long totalGoldCnt, Long totalBlacklistCnt) {
        this.totalUserCnt = totalUserCnt;
        this.totalAdminCnt = totalAdminCnt;
        this.totalBronzeCnt = totalBronzeCnt;
        this.totalSilverCnt = totalSilverCnt;
        this.totalGoldCnt = totalGoldCnt;
        this.totalBlacklistCnt = totalBlacklistCnt;
    }

    // 각 필드의 getter 메서드
    public Long getTotalUserCnt() {
        return totalUserCnt;
    }

    public Long getTotalAdminCnt() {
        return totalAdminCnt;
    }

    public Long getTotalBronzeCnt() {
        return totalBronzeCnt;
    }

    public Long getTotalSilverCnt() {
        return totalSilverCnt;
    }

    public Long getTotalGoldCnt() {
        return totalGoldCnt;
    }

    public Long getTotalBlacklistCnt() {
        return totalBlacklistCnt;
    }
}

