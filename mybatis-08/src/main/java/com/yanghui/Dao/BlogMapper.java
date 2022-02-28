package com.yanghui.Dao;

import com.yanghui.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
        //插入数据
    int addBook(Blog blog);
    //查询博客
    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogChoose(Map map);
}
