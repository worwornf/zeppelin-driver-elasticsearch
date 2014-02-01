package com.nflabs.zeppelin.driver.elasticsearch;

import java.util.regex.Pattern;

import com.nflabs.zeppelin.driver.ZeppelinConnection;
import com.nflabs.zeppelin.driver.ZeppelinDriver;
import com.nflabs.zeppelin.driver.ZeppelinDriverException;

public class ElasticsearchDriver extends ZeppelinDriver {
	
        public ElasticsearchDriver() {
        }

		@Override
		protected void init() {

		}

		@Override
		public boolean acceptsURL(String url) {
			return Pattern.matches("es://.*", url);
		}

		@Override
		protected ZeppelinConnection createConnection(String url)
				throws ZeppelinDriverException {
			return new ElasticsearchConnection(url);
		}
}
