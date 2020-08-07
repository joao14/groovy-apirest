package bank.pichincha.search.dto;


import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "test_user")
@XmlRootElement
public class TestUser {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "use_id")
    private Integer useId;
    @Basic(optional = false)
    @Column(name = "use_name")
    private String useName;
    @Basic(optional = false)
    @Column(name = "use_edad")
    private String useEdad;
    @Basic(optional = false)
    @Generated(GenerationTime.INSERT)
    @Column(name = "use_fecha")
    private String useFecha;

    public TestUser() {
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getUseEdad() {
        return useEdad;
    }

    public void setUseEdad(String useEdad) {
        this.useEdad = useEdad;
    }

    public String getUseFecha() {
        return useFecha;
    }

    public void setUseFecha(String useFecha) {
        this.useFecha = useFecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (useId != null ? useId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
            if (!(object instanceof TestUser)) {
            return false;
        }
        TestUser other = (TestUser) object;
        if ((this.useId == null && other.useId != null) || (this.useId != null && !this.useId.equals(other.useId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TestUser[ useId=" + useId + " ]";
    }


}
