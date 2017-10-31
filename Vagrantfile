# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure("2") do |config|
	config.vm.define "spring-boot" do |c|
		c.vm.box = "ubuntu/xenial64"
  		c.vm.hostname = "spring-boot"
  		c.vm.synced_folder ".", "/data"
  		c.vm.network "private_network", ip: "192.168.56.145"
  		c.vm.provision "shell", inline: <<-SHELL
  			sudo su
	  		apt-get update
	  		apt-get install -y openjdk-8-jdk
	  		mkdir -p /opt/application
	  		cp -r /data /opt/application
	  		cd /opt/application/data
	  		./mvnw package
	  		cp /opt/application/data/resources/spring-example.service /etc/systemd/system/spring-example.service
	  		systemctl enable spring-example.service
	  		systemctl daemon-reload
	  		systemctl restart spring-example.service
  		SHELL
	end
end