package nova.committee.mcmodwiki.core.model;

public record WikiItem(String iconUrl, String name, String introduction, String tabUrl) {
    public static WikiItem NULL = new WikiItem(null, null, null, null);
}
