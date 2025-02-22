package woorifisa.goodfriends.backend.profile.dto.response;

import lombok.Getter;

@Getter
public class ProfileBannerResponse {

    private final boolean verifiedBadge;

    private final Long dealCount;

    private final Long banCount;

    public ProfileBannerResponse(boolean verifiedBadge, Long dealCount, Long banCount) {
        this.verifiedBadge = verifiedBadge;
        this.dealCount = dealCount;
        this.banCount = banCount;
    }
}
