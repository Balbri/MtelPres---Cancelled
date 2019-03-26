package com.laposte.eboutique.eboutiquecommercewebservices.v2.controller;

import com.laposte.eboutique.facades.cmsservices.TuileQuickBuyMTELComponentFacade;
import de.hybris.platform.commercewebservicescommons.dto.TuileQuickBuyMTELProductsWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.TuileQuickBuyMTELWsDTO;
import de.hybris.platform.webservicescommons.mapping.DataMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping(value = "/{baseSiteId}/QuickBuy")
public class QuickBuyController {
    private static final Logger LOG = Logger.getLogger(QuickBuyController.class);

    @Autowired
    private TuileQuickBuyMTELComponentFacade tuileQuickBuyMTELComponentFacade;

    @Resource(name = "dataMapper")
    private DataMapper dataMapper;

    @GetMapping("/list")
    @ResponseBody
    public TuileQuickBuyMTELProductsWsDTO getTuileQuickBuyMTEL() {

        TuileQuickBuyMTELProductsWsDTO result = new TuileQuickBuyMTELProductsWsDTO();
        result.setTuiles(tuileQuickBuyMTELComponentFacade.getTuileQuickBuyMTEL().stream().map(p -> dataMapper.map( p, TuileQuickBuyMTELWsDTO.class)).collect(Collectors.toList()));

         return result;
    }

}
