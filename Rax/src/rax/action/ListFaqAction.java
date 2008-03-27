package rax.action;

import java.util.List;

import org.apache.log4j.Logger;

import rax.model.Faq;
import rax.service.FaqService;

import com.opensymphony.xwork2.ActionSupport;

public class ListFaqAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private final static Logger logger = Logger.getLogger(ListFaqAction.class);

    private FaqService faqService = null;

    private List<Faq> faqList;
    private int count = 0;
    
    @Override
    public String execute() throws Exception {
        
        faqList = faqService.listAllFaqs(true);
        try {
            count = faqList.size();
            logger.trace(count);
        } catch (Exception ex) {
            logger.error(ex.toString());
        }

        return SUCCESS;
    }
    
    public void setFaqService(FaqService service) {
        faqService = service;
    }

    public List<Faq> getFaqList() {
        return faqList;
    }

    public int getCount() {
        return count;
    }

}