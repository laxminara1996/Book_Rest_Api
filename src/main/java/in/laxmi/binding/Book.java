package in.laxmi.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Book {
private Integer bookid;
private String name;
private Integer price;
}
