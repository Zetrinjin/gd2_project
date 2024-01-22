package project.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.data.dao.NewsDao;
import project.data.pojo.News;

import java.util.List;

@Controller
//@RequestMapping("/news")
public class Newss {

    @Autowired
    private NewsDao newsDao;

    /*@GetMapping
    public String getNewss() {
        return "news";
    }*/
    @GetMapping("/news")
    public String getNews(Model model )  {
        int pageSize=4;
        int page = 1;

        int startIndex = page * pageSize;
        List<News> newsses = newsDao.getPagination(startIndex, pageSize);
        model.addAttribute("newsList",newsses);
        int totalNews = newsDao.getTotalCount();
        int totalPages = (int) Math.ceil((double) totalNews / pageSize);

        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", totalPages);
        return "news";
    }
}
