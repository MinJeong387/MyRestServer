package learnbyteaching.shoplist.mappers;

import java.util.List;

import learnbyteaching.shoplist.repository.vo.ShopItem;

//	shoplist.xml과 1:1 매핑된 인터페이스
public interface ShoplistMapper {
//	<select id="selectAllItems" resultType="shopItem">
	List<ShopItem> selectAllItems();
//	<insert id="insertItem" parameterType="shopItem">
	int insertItem(ShopItem item);
//	<select id="selectById" parameterType="int" 
//			resultType="shopItem">
	ShopItem selectById(Integer id);
//	<update id="updateItem" parameterType="shopItem">
	int updateItem(ShopItem item);
//	<delete id="deleteItem"
//			parameterType="int">
	int deleteItem(Integer id);
}
