import com.yanghui.Dao.BlogMapper;
import com.yanghui.pojo.Blog;
import com.yanghui.utilis.IDutils;
import com.yanghui.utilis.mybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class mytest {
    @Test
        public void addBlogTest(){
            SqlSession sqlSession = mybatisUtils.getSqlSession();
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            Blog blog = new Blog();
            blog.setId(IDutils.getId());
            blog.setTitle("Mybatis");
            blog.setAuthor("狂神说");
            blog.setCreateTime(new Date());
            blog.setViews(9999);

            mapper.addBook(blog);

            blog.setId(IDutils.getId());
            blog.setTitle("Java");
            mapper.addBook(blog);

            blog.setId(IDutils.getId());
            blog.setTitle("Spring");
            mapper.addBook(blog);

            blog.setId(IDutils.getId());
            blog.setTitle("微服务");
            mapper.addBook(blog);

            sqlSession.close();
    }
    @Test
    public void TestIF(){
        SqlSession sqlSession=mybatisUtils.getSqlSession();
        BlogMapper mapper=sqlSession.getMapper(BlogMapper.class);
        HashMap map=new HashMap();
       // map.put("title","Mybatis");
        map.put("author","杨辉");
        List<Blog> blogs=mapper.queryBlogChoose(map);
        for (Blog blog:blogs
             ) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

}
