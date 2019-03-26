package com.laposte.eboutique.facades.cmsservices;

import com.laposte.eboutique.core.model.TuileQuickBuyMTELComponentModel;
import com.laposte.eboutique.core.model.cms2.components.QuickBuyMTELComponentModel;
import de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class TuileQuickBuyMTELComponentFacade extends CmsComponentFacade {
    private static final Logger LOG = Logger.getLogger(TuileQuickBuyMTELComponentFacade.class);
    private static final String PAGE_UID = "AppMobile_mtelQuickbuyPage";

    public List<TuileQuickBuyMTELComponentModel> getTuileQuickBuyMTEL() {
        List<AbstractCMSComponentModel> cmsComponents = getAllCmsComponents(PAGE_UID);
        List<TuileQuickBuyMTELComponentModel> tuiles = new ArrayList<>();
        if (cmsComponents != null) {
            for (AbstractCMSComponentModel component : cmsComponents) {
                if (component instanceof QuickBuyMTELComponentModel) {
                    QuickBuyMTELComponentModel quickBuyComponent = (QuickBuyMTELComponentModel) component;
                    tuiles.addAll(quickBuyComponent.getTuilesQuickBuy());
                }
            }
        }

        return tuiles;

    }

}
