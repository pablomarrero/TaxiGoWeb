import { platformBrowser } from '@angular/platform-browser';
import { ProdConfig } from './blocks/config/prod.config';
import { TaxiGoWebAppModuleNgFactory } from '../../../../build/aot/src/main/webapp/app/app.module.ngfactory';

ProdConfig();

platformBrowser().bootstrapModuleFactory(TaxiGoWebAppModuleNgFactory)
.then((success) => console.log(`Application started`))
.catch((err) => console.error(err));
