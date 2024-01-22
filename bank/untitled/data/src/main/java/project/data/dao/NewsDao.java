package project.data.dao;

/*import org.springframework.data.domain.Page;*/
import project.data.model.NewsDto;
import project.data.pojo.News;

import java.awt.print.Pageable;
import java.util.List;

public interface NewsDao {
    List<News> getPagination(int startPosition, int pageSize);

    /*Page<News> findPaginated(int pageNo, int pageSize);*/

    int getTotalCount();
}
