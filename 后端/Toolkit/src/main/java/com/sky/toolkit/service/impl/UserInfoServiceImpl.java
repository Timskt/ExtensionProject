package com.sky.toolkit.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import com.baomidou.mybatisplus.extension.kotlin.KtQueryChainWrapper;
import com.baomidou.mybatisplus.extension.kotlin.KtUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sky.toolkit.entity.UserInfo;
import com.sky.toolkit.mapper.UserInfoMapper;
import com.sky.toolkit.service.UserInfoService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/***
 @author 蔡联发
 @date 2022/10/22
 @version 1.0
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    @Override
    public boolean save(UserInfo entity) {
        return super.save(entity);
    }

    @Override
    public boolean saveBatch(Collection<UserInfo> entityList) {
        return super.saveBatch(entityList);
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<UserInfo> entityList) {
        return super.saveOrUpdateBatch(entityList);
    }

    @Override
    public boolean removeById(UserInfo entity) {
        return super.removeById(entity);
    }

    @Override
    public boolean removeByMap(Map<String, Object> columnMap) {
        return super.removeByMap(columnMap);
    }

    @Override
    public boolean remove(Wrapper<UserInfo> queryWrapper) {
        return super.remove(queryWrapper);
    }

    @Override
    public boolean removeByIds(Collection<?> list, boolean useFill) {
        return super.removeByIds(list, useFill);
    }

    @Override
    public boolean removeBatchByIds(Collection<?> list) {
        return super.removeBatchByIds(list);
    }

    @Override
    public boolean removeBatchByIds(Collection<?> list, boolean useFill) {
        return super.removeBatchByIds(list, useFill);
    }

    @Override
    public boolean updateById(UserInfo entity) {
        return super.updateById(entity);
    }

    @Override
    public boolean update(Wrapper<UserInfo> updateWrapper) {
        return super.update(updateWrapper);
    }

    @Override
    public boolean update(UserInfo entity, Wrapper<UserInfo> updateWrapper) {
        return super.update(entity, updateWrapper);
    }

    @Override
    public boolean updateBatchById(Collection<UserInfo> entityList) {
        return super.updateBatchById(entityList);
    }

    @Override
    public UserInfo getById(Serializable id) {
        return super.getById(id);
    }

    @Override
    public List<UserInfo> listByIds(Collection<? extends Serializable> idList) {
        return super.listByIds(idList);
    }

    @Override
    public List<UserInfo> listByMap(Map<String, Object> columnMap) {
        return super.listByMap(columnMap);
    }

    @Override
    public UserInfo getOne(Wrapper<UserInfo> queryWrapper) {
        return super.getOne(queryWrapper);
    }

    @Override
    public long count() {
        return super.count();
    }

    @Override
    public long count(Wrapper<UserInfo> queryWrapper) {
        return super.count(queryWrapper);
    }

    @Override
    public List<UserInfo> list(Wrapper<UserInfo> queryWrapper) {
        return super.list(queryWrapper);
    }

    @Override
    public List<UserInfo> list() {
        return super.list();
    }

    @Override
    public <E extends IPage<UserInfo>> E page(E page, Wrapper<UserInfo> queryWrapper) {
        return super.page(page, queryWrapper);
    }

    @Override
    public <E extends IPage<UserInfo>> E page(E page) {
        return super.page(page);
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<UserInfo> queryWrapper) {
        return super.listMaps(queryWrapper);
    }

    @Override
    public List<Map<String, Object>> listMaps() {
        return super.listMaps();
    }

    @Override
    public List<Object> listObjs() {
        return super.listObjs();
    }

    @Override
    public <V> List<V> listObjs(Function<? super Object, V> mapper) {
        return super.listObjs(mapper);
    }

    @Override
    public List<Object> listObjs(Wrapper<UserInfo> queryWrapper) {
        return super.listObjs(queryWrapper);
    }

    @Override
    public <V> List<V> listObjs(Wrapper<UserInfo> queryWrapper, Function<? super Object, V> mapper) {
        return super.listObjs(queryWrapper, mapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page, Wrapper<UserInfo> queryWrapper) {
        return super.pageMaps(page, queryWrapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page) {
        return super.pageMaps(page);
    }

    @Override
    public QueryChainWrapper<UserInfo> query() {
        return super.query();
    }

    @Override
    public LambdaQueryChainWrapper<UserInfo> lambdaQuery() {
        return super.lambdaQuery();
    }

    @Override
    public KtQueryChainWrapper<UserInfo> ktQuery() {
        return super.ktQuery();
    }

    @Override
    public KtUpdateChainWrapper<UserInfo> ktUpdate() {
        return super.ktUpdate();
    }

    @Override
    public UpdateChainWrapper<UserInfo> update() {
        return super.update();
    }

    @Override
    public LambdaUpdateChainWrapper<UserInfo> lambdaUpdate() {
        return super.lambdaUpdate();
    }

    @Override
    public boolean saveOrUpdate(UserInfo entity, Wrapper<UserInfo> updateWrapper) {
        return super.saveOrUpdate(entity, updateWrapper);
    }
}
