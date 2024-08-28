package com.ruoyi.manage.mapper;

import java.util.List;
import com.ruoyi.manage.domain.TbRegion;

/**
 * 区域管理Mapper接口
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
public interface TbRegionMapper 
{
    /**
     * 查询区域管理
     * 
     * @param id 区域管理主键
     * @return 区域管理
     */
    public TbRegion selectTbRegionById(Long id);

    /**
     * 查询区域管理列表
     * 
     * @param tbRegion 区域管理
     * @return 区域管理集合
     */
    public List<TbRegion> selectTbRegionList(TbRegion tbRegion);

    /**
     * 新增区域管理
     * 
     * @param tbRegion 区域管理
     * @return 结果
     */
    public int insertTbRegion(TbRegion tbRegion);

    /**
     * 修改区域管理
     * 
     * @param tbRegion 区域管理
     * @return 结果
     */
    public int updateTbRegion(TbRegion tbRegion);

    /**
     * 删除区域管理
     * 
     * @param id 区域管理主键
     * @return 结果
     */
    public int deleteTbRegionById(Long id);

    /**
     * 批量删除区域管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbRegionByIds(Long[] ids);
}
