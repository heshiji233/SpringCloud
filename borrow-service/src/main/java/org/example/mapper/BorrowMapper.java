package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.entity.Borrow;

import java.util.List;

@Mapper
public interface BorrowMapper {
    @Select("select * from db_borrow where uid = #{uid}")
    List<Borrow> getBorrowsByUid(int uid);

//    @Select("select * from db_borrow where bid = #{bid}")
//    List<Borrow> getBorrowsByBid(int bid);
//
//    @Select("select * from db_borrow where bid = #{bid} and uid = #{uid}")
//    Borrow getBorrow(int uid, int bid);
}
