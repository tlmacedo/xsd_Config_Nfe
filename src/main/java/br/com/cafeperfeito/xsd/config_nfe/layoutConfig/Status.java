//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementaxe7xe3o de Referxeancia (JAXB) de Bind XML, v2.3.1-b171012.0423 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificaxe7xf5es neste arquivo serxe3o perdidas apxf3s a recompilaxe7xe3o do esquema de origem. 
// Gerado em: 2020.12.02 xe0s 10:17:57 PM AMT 
//


package br.com.cafeperfeito.xsd.config_nfe.layoutConfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Status complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o contexFAdo esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType name="Status"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="descricao" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="simplificada" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status")
public class Status {

    @XmlAttribute(name = "id", required = true)
    protected long id;
    @XmlAttribute(name = "descricao", required = true)
    protected String descricao;
    @XmlAttribute(name = "simplificada", required = true)
    protected String simplificada;

    /**
     * ObtxE9m o valor da propriedade id.
     *
     */
    public long getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     *
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * ObtxE9m o valor da propriedade descricao.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * ObtxE9m o valor da propriedade simplificada.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSimplificada() {
        return simplificada;
    }

    /**
     * Define o valor da propriedade simplificada.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSimplificada(String value) {
        this.simplificada = value;
    }

}
