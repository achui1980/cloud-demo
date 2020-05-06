FROM sebp/elk

# overwrite existing file
ADD /path/to/your-30-output.conf /etc/logstash/conf.d/30-output.conf

# add new file
ADD /path/to/new-12-some-filter.conf /etc/logstash/conf.d/12-some-filter.conf

WORKDIR ${LOGSTASH_HOME}
RUN gosu logstash bin/logstash-plugin install logstash-codec-json_lines