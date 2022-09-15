package com.example.demo.repository;

import com.example.demo.dto.ICartDto;
import com.example.demo.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ICartRepository extends JpaRepository<Cart, Integer> {

    @Query(value = " select p.id, p.name,p.image, p.`price_sale` as priceSale , sum(c.quantity) as quantity, sum(p.price_sale * c.quantity) as total " +
            " from cart c " +
            " join product p on c.id_product = p.id  where c.is_delete = 0 " +
            " group by p.`name` ", nativeQuery = true)
    List<ICartDto> displayProductInCart();

    @Query(value = " select sum(tong_tien) as total from " +
            " (select p.name, p.`price_sale`, sum(c.quantity) as so_luong, sum(p.price_sale * c.quantity) as tong_tien " +
            " from cart c " +
            " join product p on c.id_product = p.id  where c.is_delete = 0 " +
            " group by p.`name` ) temp ", nativeQuery = true)
    ICartDto displayTotalPayment();
//
//    @Query(value = " INSERT INTO `cart` (`is_delete`, `id_product`) VALUES (b'0', b'1') ", nativeQuery = true)
//    Cart addCard();

    @Transactional
    @Modifying
    @Query(value = " UPDATE `cart` set cart.`is_delete` = 1 WHERE `id_product` = :idKey", nativeQuery = true)
    void deleteByIdProduct(@Param("idKey") Integer id);

    @Query(value = " select * from cart " +
            " join product " +
            " on cart.id_product = product.id " +
            " where cart.id_product = :#{#cart.product.id} ", nativeQuery = true)
    Cart findProductOrderListByCustomerAndProduct(Cart cart);
}
