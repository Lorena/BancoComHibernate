package hibernate.acesso.ao.bd.com.entity.manager;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public abstract class BaseBean implements Serializable{

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
	public boolean equals(Object obj){
		return EqualsBuilder.reflectionEquals(this, obj);
	}
	
}
