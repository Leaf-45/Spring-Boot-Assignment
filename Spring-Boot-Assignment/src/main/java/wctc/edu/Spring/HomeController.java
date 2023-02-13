package wctc.edu.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
    @RequestMapping("/")
    public String showHomePage()
    {
        return "/index.html";
    }

    @RequestMapping("Library")
    public String showLibraryPage()
    {
        return "/tutorials/focusOnTheLibrary.html";
    }

    @RequestMapping("Backlog")
    public String showBacklogPage()
    {
        return "/tutorials/acceptTheBacklog.html";
    }

    @RequestMapping("Variety")
    public String showVarietyPage()
    {
        return "/tutorials/varietyOfGames.html";
    }
    @RequestMapping("Sources")
    public String showSourcesPage()
    {
        return "/Sources.html";
    }



}
