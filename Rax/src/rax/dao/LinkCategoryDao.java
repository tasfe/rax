package rax.dao;

import java.util.List;

import rax.model.LinkCategory;

public interface LinkCategoryDao extends GenericDao<LinkCategory, Long> {

    @Override
    public Long create(LinkCategory newInstance);

    @Override
    public int delete(LinkCategory persistentObject);

    @Override
    public LinkCategory read(Long id);

    @Override
    public int update(LinkCategory transientObject);

    @Override
    public long count();

    @Override
    public List<LinkCategory> list(int index, int num);

    @Override
    public List<LinkCategory> listAll();

}
