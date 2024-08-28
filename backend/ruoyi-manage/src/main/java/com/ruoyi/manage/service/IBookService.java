package com.ruoyi.manage.service;

import java.util.List;
import com.ruoyi.manage.domain.Book;
import com.ruoyi.manage.domain.vo.BookVo;

/**
 * 书籍管理Service接口
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
public interface IBookService 
{
    /**
     * 查询书籍管理
     * 
     * @param id 书籍管理主键
     * @return 书籍管理
     */
    public Book selectBookById(Long id);

    /**
     * 查询书籍管理列表
     * 
     * @param book 书籍管理
     * @return 书籍管理集合
     */
    public List<Book> selectBookList(Book book);

    public List<BookVo> selectBookVoList(Book book);

    /**
     * 新增书籍管理
     * 
     * @param book 书籍管理
     * @return 结果
     */
    public int insertBook(Book book);

    /**
     * 修改书籍管理
     * 
     * @param book 书籍管理
     * @return 结果
     */
    public int updateBook(Book book);

    /**
     * 批量删除书籍管理
     * 
     * @param ids 需要删除的书籍管理主键集合
     * @return 结果
     */
    public int deleteBookByIds(Long[] ids);

    /**
     * 删除书籍管理信息
     * 
     * @param id 书籍管理主键
     * @return 结果
     */
    public int deleteBookById(Long id);
}
