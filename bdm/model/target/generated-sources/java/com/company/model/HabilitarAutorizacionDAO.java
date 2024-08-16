
package com.company.model;

import java.time.LocalDate;
import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface HabilitarAutorizacionDAO
    extends BusinessObjectDAO
{


    public HabilitarAutorizacion findByPersistenceId(Long persistenceId);

    public List<HabilitarAutorizacion> findBySolicitudAutorizacionId(Long solicitudAutorizacionId, int startIndex, int maxResults);

    public List<HabilitarAutorizacion> findByDniSolicitante(Long dniSolicitante, int startIndex, int maxResults);

    public List<HabilitarAutorizacion> findByNombresSoliAutorizacion(String nombresSoliAutorizacion, int startIndex, int maxResults);

    public List<HabilitarAutorizacion> findByApellidosSoliAutorizacion(String apellidosSoliAutorizacion, int startIndex, int maxResults);

    public List<HabilitarAutorizacion> findByFechaSolicitud(LocalDate fechaSolicitud, int startIndex, int maxResults);

    public List<HabilitarAutorizacion> findByCategoriaAutorizacion(String categoriaAutorizacion, int startIndex, int maxResults);

    public List<HabilitarAutorizacion> findByFoto(Boolean foto, int startIndex, int maxResults);

    public List<HabilitarAutorizacion> findBySancionAutorizacion(Boolean sancionAutorizacion, int startIndex, int maxResults);

    public List<HabilitarAutorizacion> findByAntecedentesPenales(Boolean antecedentesPenales, int startIndex, int maxResults);

    public List<HabilitarAutorizacion> findByAntecedentesPoliciales(Boolean antecedentesPoliciales, int startIndex, int maxResults);

    public List<HabilitarAutorizacion> findByMultas(Boolean multas, int startIndex, int maxResults);

    public List<HabilitarAutorizacion> findByEstadoSolicitud(String estadoSolicitud, int startIndex, int maxResults);

    public List<HabilitarAutorizacion> find(int startIndex, int maxResults);

    public Long countForFindBySolicitudAutorizacionId(Long solicitudAutorizacionId);

    public Long countForFindByDniSolicitante(Long dniSolicitante);

    public Long countForFindByNombresSoliAutorizacion(String nombresSoliAutorizacion);

    public Long countForFindByApellidosSoliAutorizacion(String apellidosSoliAutorizacion);

    public Long countForFindByFechaSolicitud(LocalDate fechaSolicitud);

    public Long countForFindByCategoriaAutorizacion(String categoriaAutorizacion);

    public Long countForFindByFoto(Boolean foto);

    public Long countForFindBySancionAutorizacion(Boolean sancionAutorizacion);

    public Long countForFindByAntecedentesPenales(Boolean antecedentesPenales);

    public Long countForFindByAntecedentesPoliciales(Boolean antecedentesPoliciales);

    public Long countForFindByMultas(Boolean multas);

    public Long countForFindByEstadoSolicitud(String estadoSolicitud);

    public Long countForFind();

    public HabilitarAutorizacion newInstance(Long solicitudAutorizacionId, Long dniSolicitante, String nombresSoliAutorizacion, String apellidosSoliAutorizacion, LocalDate fechaSolicitud, String categoriaAutorizacion, Boolean sancionAutorizacion, Boolean antecedentesPenales, Boolean antecedentesPoliciales, Boolean multas);

}
