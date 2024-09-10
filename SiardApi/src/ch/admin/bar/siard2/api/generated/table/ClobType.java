//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2024.08.22 시간 03:57:05 PM KST 
//


package ch.admin.bar.siard2.api.generated.table;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * a text large object stored separately (addressed by URI). The digest makes sure, the connection to the object is not completely lost. The length is in characters, not in bytes.
 * 
 * <p>clobType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="clobType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="file" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="digestType" type="{http://www.bar.admin.ch/xmlns/siard/2/table.xsd}digestTypeType" />
 *       &lt;attribute name="digest" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clobType", namespace = "http://www.bar.admin.ch/xmlns/siard/2/table.xsd", propOrder = {
    "value"
})
public class ClobType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "file")
    @XmlSchemaType(name = "anyURI")
    protected String file;
    @XmlAttribute(name = "length")
    protected BigInteger length;
    @XmlAttribute(name = "digestType")
    protected DigestTypeType digestType;
    @XmlAttribute(name = "digest")
    protected String digest;

    /**
     * value 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * value 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * file 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * file 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
    }

    /**
     * length 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * length 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

    /**
     * digestType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DigestTypeType }
     *     
     */
    public DigestTypeType getDigestType() {
        return digestType;
    }

    /**
     * digestType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestTypeType }
     *     
     */
    public void setDigestType(DigestTypeType value) {
        this.digestType = value;
    }

    /**
     * digest 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigest() {
        return digest;
    }

    /**
     * digest 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigest(String value) {
        this.digest = value;
    }

}
