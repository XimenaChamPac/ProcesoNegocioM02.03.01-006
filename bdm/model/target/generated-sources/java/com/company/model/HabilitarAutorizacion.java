
package com.company.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 * 
 */
@javax.persistence.Entity(name = "HabilitarAutorizacion")
@Table(name = "HABILITARAUTORIZACION")
@NamedQueries({
    @NamedQuery(name = "HabilitarAutorizacion.findByPersistenceId", query = "SELECT h\nFROM HabilitarAutorizacion h\nWHERE h.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "HabilitarAutorizacion.findBySolicitudAutorizacionId", query = "SELECT h\nFROM HabilitarAutorizacion h\nWHERE h.solicitudAutorizacionId= :solicitudAutorizacionId\nORDER BY h.persistenceId"),
    @NamedQuery(name = "HabilitarAutorizacion.findByDniSolicitante", query = "SELECT h\nFROM HabilitarAutorizacion h\nWHERE h.dniSolicitante= :dniSolicitante\nORDER BY h.persistenceId"),
    @NamedQuery(name = "HabilitarAutorizacion.findByNombresSoliAutorizacion", query = "SELECT h\nFROM HabilitarAutorizacion h\nWHERE h.nombresSoliAutorizacion= :nombresSoliAutorizacion\nORDER BY h.persistenceId"),
    @NamedQuery(name = "HabilitarAutorizacion.findByApellidosSoliAutorizacion", query = "SELECT h\nFROM HabilitarAutorizacion h\nWHERE h.apellidosSoliAutorizacion= :apellidosSoliAutorizacion\nORDER BY h.persistenceId"),
    @NamedQuery(name = "HabilitarAutorizacion.findByFechaSolicitud", query = "SELECT h\nFROM HabilitarAutorizacion h\nWHERE h.fechaSolicitud= :fechaSolicitud\nORDER BY h.persistenceId"),
    @NamedQuery(name = "HabilitarAutorizacion.findByCategoriaAutorizacion", query = "SELECT h\nFROM HabilitarAutorizacion h\nWHERE h.categoriaAutorizacion= :categoriaAutorizacion\nORDER BY h.persistenceId"),
    @NamedQuery(name = "HabilitarAutorizacion.findByFoto", query = "SELECT h\nFROM HabilitarAutorizacion h\nWHERE h.foto= :foto\nORDER BY h.persistenceId"),
    @NamedQuery(name = "HabilitarAutorizacion.findBySancionAutorizacion", query = "SELECT h\nFROM HabilitarAutorizacion h\nWHERE h.sancionAutorizacion= :sancionAutorizacion\nORDER BY h.persistenceId"),
    @NamedQuery(name = "HabilitarAutorizacion.findByAntecedentesPenales", query = "SELECT h\nFROM HabilitarAutorizacion h\nWHERE h.antecedentesPenales= :antecedentesPenales\nORDER BY h.persistenceId"),
    @NamedQuery(name = "HabilitarAutorizacion.findByAntecedentesPoliciales", query = "SELECT h\nFROM HabilitarAutorizacion h\nWHERE h.antecedentesPoliciales= :antecedentesPoliciales\nORDER BY h.persistenceId"),
    @NamedQuery(name = "HabilitarAutorizacion.findByMultas", query = "SELECT h\nFROM HabilitarAutorizacion h\nWHERE h.multas= :multas\nORDER BY h.persistenceId"),
    @NamedQuery(name = "HabilitarAutorizacion.findByEstadoSolicitud", query = "SELECT h\nFROM HabilitarAutorizacion h\nWHERE h.estadoSolicitud= :estadoSolicitud\nORDER BY h.persistenceId"),
    @NamedQuery(name = "HabilitarAutorizacion.find", query = "SELECT h\nFROM HabilitarAutorizacion h\nORDER BY h.persistenceId"),
    @NamedQuery(name = "HabilitarAutorizacion.countForFindBySolicitudAutorizacionId", query = "SELECT COUNT(h)\nFROM HabilitarAutorizacion h\nWHERE h.solicitudAutorizacionId= :solicitudAutorizacionId\n"),
    @NamedQuery(name = "HabilitarAutorizacion.countForFindByDniSolicitante", query = "SELECT COUNT(h)\nFROM HabilitarAutorizacion h\nWHERE h.dniSolicitante= :dniSolicitante\n"),
    @NamedQuery(name = "HabilitarAutorizacion.countForFindByNombresSoliAutorizacion", query = "SELECT COUNT(h)\nFROM HabilitarAutorizacion h\nWHERE h.nombresSoliAutorizacion= :nombresSoliAutorizacion\n"),
    @NamedQuery(name = "HabilitarAutorizacion.countForFindByApellidosSoliAutorizacion", query = "SELECT COUNT(h)\nFROM HabilitarAutorizacion h\nWHERE h.apellidosSoliAutorizacion= :apellidosSoliAutorizacion\n"),
    @NamedQuery(name = "HabilitarAutorizacion.countForFindByFechaSolicitud", query = "SELECT COUNT(h)\nFROM HabilitarAutorizacion h\nWHERE h.fechaSolicitud= :fechaSolicitud\n"),
    @NamedQuery(name = "HabilitarAutorizacion.countForFindByCategoriaAutorizacion", query = "SELECT COUNT(h)\nFROM HabilitarAutorizacion h\nWHERE h.categoriaAutorizacion= :categoriaAutorizacion\n"),
    @NamedQuery(name = "HabilitarAutorizacion.countForFindByFoto", query = "SELECT COUNT(h)\nFROM HabilitarAutorizacion h\nWHERE h.foto= :foto\n"),
    @NamedQuery(name = "HabilitarAutorizacion.countForFindBySancionAutorizacion", query = "SELECT COUNT(h)\nFROM HabilitarAutorizacion h\nWHERE h.sancionAutorizacion= :sancionAutorizacion\n"),
    @NamedQuery(name = "HabilitarAutorizacion.countForFindByAntecedentesPenales", query = "SELECT COUNT(h)\nFROM HabilitarAutorizacion h\nWHERE h.antecedentesPenales= :antecedentesPenales\n"),
    @NamedQuery(name = "HabilitarAutorizacion.countForFindByAntecedentesPoliciales", query = "SELECT COUNT(h)\nFROM HabilitarAutorizacion h\nWHERE h.antecedentesPoliciales= :antecedentesPoliciales\n"),
    @NamedQuery(name = "HabilitarAutorizacion.countForFindByMultas", query = "SELECT COUNT(h)\nFROM HabilitarAutorizacion h\nWHERE h.multas= :multas\n"),
    @NamedQuery(name = "HabilitarAutorizacion.countForFindByEstadoSolicitud", query = "SELECT COUNT(h)\nFROM HabilitarAutorizacion h\nWHERE h.estadoSolicitud= :estadoSolicitud\n"),
    @NamedQuery(name = "HabilitarAutorizacion.countForFind", query = "SELECT COUNT(h)\nFROM HabilitarAutorizacion h\n")
})
public class HabilitarAutorizacion implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "SOLICITUDAUTORIZACIONID", nullable = false)
    private Long solicitudAutorizacionId;
    @Column(name = "DNISOLICITANTE", nullable = false)
    private Long dniSolicitante;
    @Column(name = "NOMBRESSOLIAUTORIZACION", nullable = false, length = 255)
    private String nombresSoliAutorizacion;
    @Column(name = "APELLIDOSSOLIAUTORIZACION", nullable = false, length = 255)
    private String apellidosSoliAutorizacion;
    @Column(name = "FECHASOLICITUD", nullable = false, length = 10)
    @Convert(converter = org.bonitasoft.engine.business.data.generator.DateConverter.class)
    private LocalDate fechaSolicitud;
    @Column(name = "CATEGORIAAUTORIZACION", nullable = false, length = 255)
    private String categoriaAutorizacion;
    @Column(name = "FOTO", nullable = true)
    private Boolean foto;
    @Column(name = "SANCIONAUTORIZACION", nullable = false)
    private Boolean sancionAutorizacion;
    @Column(name = "ANTECEDENTESPENALES", nullable = false)
    private Boolean antecedentesPenales;
    @Column(name = "ANTECEDENTESPOLICIALES", nullable = false)
    private Boolean antecedentesPoliciales;
    @Column(name = "MULTAS", nullable = false)
    private Boolean multas;
    @Column(name = "ESTADOSOLICITUD", nullable = true, length = 255)
    private String estadoSolicitud;

    public HabilitarAutorizacion() {
    }

    public void setPersistenceId(Long persistenceId) {
        this.persistenceId = persistenceId;
    }

    public Long getPersistenceId() {
        return persistenceId;
    }

    public void setPersistenceVersion(Long persistenceVersion) {
        this.persistenceVersion = persistenceVersion;
    }

    public Long getPersistenceVersion() {
        return persistenceVersion;
    }

    public void setSolicitudAutorizacionId(Long solicitudAutorizacionId) {
        this.solicitudAutorizacionId = solicitudAutorizacionId;
    }

    public Long getSolicitudAutorizacionId() {
        return solicitudAutorizacionId;
    }

    public void setDniSolicitante(Long dniSolicitante) {
        this.dniSolicitante = dniSolicitante;
    }

    public Long getDniSolicitante() {
        return dniSolicitante;
    }

    public void setNombresSoliAutorizacion(String nombresSoliAutorizacion) {
        this.nombresSoliAutorizacion = nombresSoliAutorizacion;
    }

    public String getNombresSoliAutorizacion() {
        return nombresSoliAutorizacion;
    }

    public void setApellidosSoliAutorizacion(String apellidosSoliAutorizacion) {
        this.apellidosSoliAutorizacion = apellidosSoliAutorizacion;
    }

    public String getApellidosSoliAutorizacion() {
        return apellidosSoliAutorizacion;
    }

    public void setFechaSolicitud(LocalDate fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public LocalDate getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setCategoriaAutorizacion(String categoriaAutorizacion) {
        this.categoriaAutorizacion = categoriaAutorizacion;
    }

    public String getCategoriaAutorizacion() {
        return categoriaAutorizacion;
    }

    public void setFoto(Boolean foto) {
        this.foto = foto;
    }

    public Boolean isFoto() {
        return foto;
    }

    public void setSancionAutorizacion(Boolean sancionAutorizacion) {
        this.sancionAutorizacion = sancionAutorizacion;
    }

    public Boolean isSancionAutorizacion() {
        return sancionAutorizacion;
    }

    public void setAntecedentesPenales(Boolean antecedentesPenales) {
        this.antecedentesPenales = antecedentesPenales;
    }

    public Boolean isAntecedentesPenales() {
        return antecedentesPenales;
    }

    public void setAntecedentesPoliciales(Boolean antecedentesPoliciales) {
        this.antecedentesPoliciales = antecedentesPoliciales;
    }

    public Boolean isAntecedentesPoliciales() {
        return antecedentesPoliciales;
    }

    public void setMultas(Boolean multas) {
        this.multas = multas;
    }

    public Boolean isMultas() {
        return multas;
    }

    public void setEstadoSolicitud(String estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }

    public String getEstadoSolicitud() {
        return estadoSolicitud;
    }

}
