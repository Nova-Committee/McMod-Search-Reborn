package nova.committee.mcmodwiki.core.model;


import java.util.List;

/**
 * ### 模组实体
 *
 * @param iconUrl       模组图片
 * @param shortName     模组缩写
 * @param mainName      模组主要名称
 * @param secondaryName 模组次要名称
 * @param authors       作者或开发团队
 * @param introduction  模组介绍
 * @param relatedLinks  相关链接
 * @param versions      支持的版本
 */
public record WikiModule(String iconUrl, String shortName,
                         String mainName, String secondaryName,
                         String authors, String introduction,
                         String relatedLinks, String versions) {

    /**
     * ### 作者或开发团队
     *
     * @param avatarUrl 头像 url
     * @param name      名称
     * @param relation  和模组的关系
     */
    record Author(String avatarUrl, String name, String relation) {
    }

    /**
     * 支持的版本
     *
     * @param name    api 名称
     * @param version 支持的版本列表
     */
    record Version(String name, List<String> version) {
    }
}
