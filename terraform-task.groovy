node{
    stage("Pull Repo"){
        git branch: 'solution', url: 'https://github.com/nuraiusa/terraform-task-jenkins.git '
    }
    stage("Terraform Init"){
        sh """
          terraform init
        """
    }
    stage("Terraform Apply"){
        sh """
          terraform apply
        """
    }
}