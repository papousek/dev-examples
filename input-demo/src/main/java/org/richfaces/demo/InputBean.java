package org.richfaces.demo;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;
import java.util.logging.Logger;
import javax.faces.event.ValueChangeEvent;

@SessionScoped
@ManagedBean(name = "inputBean")
public class InputBean {
    private static final Logger LOGGER = Logger.getLogger(InputBean.class.getName());
    private int counter;
    private String value;
    private List<String> values;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public int getCounter() {
        return counter;
    }

    public Date getDate() {
        return new Date();
    }

    public void increaseCounter(ValueChangeEvent event) {
        counter++;
        LOGGER.info("Counter increased to " + counter);
    }
}
